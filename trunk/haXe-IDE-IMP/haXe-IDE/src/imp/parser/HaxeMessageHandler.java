/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/
package imp.parser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.imp.editor.UniversalEditor;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

// TODO: Auto-generated Javadoc
/**
 * The Class HaxeMessageHandler.
 * 
 * @author kondratyev
 */
public class HaxeMessageHandler implements IMessageHandler {

	/**
	 * The Class PositionedMessage.
	 * 
	 * @author Anatoly Kondratyev
	 */
	private static class PositionedMessage {
		
		/** The message. */
		public final String message;
		
		/** The pos. */
		public final Position pos;

		/**
		 * Instantiates a new positioned message.
		 * 
		 * @param msg
		 *            the msg
		 * @param pos
		 *            the pos
		 */
		public PositionedMessage(String msg, Position pos) {
			this.message = msg;
			this.pos = pos;
		}
	}

	/** The editor. */
	private final ITextEditor fEditor;
	
	/** The annotation type. */
	private final String fAnnotationType;
	
	/** The messages. */
	private final List<PositionedMessage> fMessages = new LinkedList<PositionedMessage>();
	
	/** The annotations. */
	private final List<Annotation> fAnnotations = new LinkedList<Annotation>();

	/**
	 * Instantiates a new haxe message handler.
	 * 
	 * @param textEditor
	 *            the text editor
	 * @param annotationType
	 *            the annotation type
	 */
	public HaxeMessageHandler(ITextEditor textEditor, String annotationType) {
		fEditor = textEditor;
		if (annotationType == null)
			fAnnotationType = UniversalEditor.PARSE_ANNOTATION_TYPE;
		else
			fAnnotationType = annotationType;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.imp.parser.IMessageHandler#clearMessages()
	 */
	public void clearMessages() {
		removeAnnotations();
		fMessages.clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.IMessageHandler#handleSimpleMessage(java.lang.
	 * String, int, int, int, int, int, int)
	 */
	public void handleSimpleMessage(String message, int startOffset,
			int endOffset, int startCol, int endCol, int startLine, int endLine) {
		Position pos = new Position(startOffset, endOffset - startOffset + 1);
		fMessages.add(new PositionedMessage(message, pos));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.IMessageHandler#startMessageGroup(java.lang.String
	 * )
	 */
	@Override
	public void startMessageGroup(String groupName) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.imp.parser.IMessageHandler#endMessageGroup()
	 */
	public void endMessageGroup() {
	}

	/**
	 * Removes the annotations.
	 */
	private void removeAnnotations() {
		final IDocumentProvider docProvider = fEditor.getDocumentProvider();

		if (docProvider == null) {
			return;
		}

		IAnnotationModel model = docProvider.getAnnotationModel(fEditor
				.getEditorInput());

		if (model == null)
			return;

		if (model instanceof IAnnotationModelExtension) {
			IAnnotationModelExtension modelExt = (IAnnotationModelExtension) model;
			Annotation[] oldAnnotations = fAnnotations
					.toArray(new Annotation[fAnnotations.size()]);

			modelExt.replaceAnnotations(oldAnnotations, Collections.EMPTY_MAP);
		} else {
			for (Iterator i = model.getAnnotationIterator(); i.hasNext();) {
				Annotation a = (Annotation) i.next();

				if (a.getType().equals(fAnnotationType)) {
					model.removeAnnotation(a);
				}
			}
		}
		// System.out.println("Annotations removed.");
		fAnnotations.clear();
	}

	/**
	 * End messages.
	 */
	public void endMessages() {
		IAnnotationModel model = fEditor.getDocumentProvider()
				.getAnnotationModel(fEditor.getEditorInput());
		if (model instanceof IAnnotationModelExtension) {
			IAnnotationModelExtension modelExt = (IAnnotationModelExtension) model;
			Annotation[] oldAnnotations = fAnnotations
					.toArray(new Annotation[fAnnotations.size()]);
			Map<Annotation, Position> newAnnotations = new HashMap<Annotation, Position>(
					fMessages.size());
			for (PositionedMessage pm : fMessages) {
				Annotation anno = new Annotation(fAnnotationType, false,
						pm.message);
				newAnnotations.put(anno, pm.pos);
				fAnnotations.add(anno);
			}
			modelExt.replaceAnnotations(oldAnnotations, newAnnotations);
		} else {
			for (Iterator i = model.getAnnotationIterator(); i.hasNext();) {
				Annotation a = (Annotation) i.next();

				if (a.getType().equals(fAnnotationType)) {
					model.removeAnnotation(a);
				}
			}
			for (PositionedMessage pm : fMessages) {
				Annotation annotation = new Annotation(fAnnotationType, false,
						pm.message);

				model.addAnnotation(annotation, pm.pos);
				fAnnotations.add(annotation);
			}
		}
		// System.out.println("Annotation model updated.");
		fMessages.clear();
	}

}
