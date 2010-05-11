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
package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.ExtendedTreeAdaptor;
import haxe.imp.parser.antlr.tree.exceptions.AlreadyDeclaredVarDeclarationException;
import haxe.imp.parser.antlr.tree.exceptions.HaxeCastException;
import haxe.imp.parser.antlr.tree.exceptions.NotDeclaredVarUsageException;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 * 
 * @author kondratyev
 */
public class Main {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// org.antlr.runtime.RecognitionException tmp;
		System.out.print("Reading file...");
		String path = "./src/haxe/imp/parser/antlr/main/haxe-input.txt";
		ANTLRFileStream charStream = null;
		try {
			charStream = new ANTLRFileStream(path);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Yes");

		System.out.print("Lexing file...");
		TinyHaxeTry1Lexer lexer = new TinyHaxeTry1Lexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		System.out.println("Yes");
		// ArrayList<CommonToken> arrayList = (ArrayList<CommonToken>)
		// tokenStream
		// .getTokens();
		System.out.print("Parsing file...");
		TinyHaxeTry1Parser parser = new TinyHaxeTry1Parser(tokenStream);
		parser.setTreeAdaptor(new ExtendedTreeAdaptor());
		// ExtendedCommonTree tree = new ExtendedCommonTree();
		ExtendedCommonTree tree = new ExtendedCommonTree();

		try {
			TinyHaxeTry1Parser.module_return parserResult = parser.module();
			// tree = (ExtendedCommonTree) parserResult.getTree();
			tree = (ExtendedCommonTree) parserResult.getTree();
			System.out.println("Yes");
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		printTree(tree, 0);
		System.out.println();

		try {
			tree.calculateScopes();
		} catch (AlreadyDeclaredVarDeclarationException e) {
			e.printStackTrace();
		} catch (NotDeclaredVarUsageException e) {
			System.out
					.println("\n---------------------------------------------");
			e.getUsage().toString();
			System.out
					.println("---------------------------------------------\n");
			e.printStackTrace();
		} catch (HaxeCastException e) {
			System.out.println("-------------------------");
			e.getNodeWithException().toStringTree();
		}
		printTree(tree, 0);

		for (int i = 0; i <= 201; i++) {
			ExtendedCommonTree target = tree.getNodeByPosition(i);

			System.out.println(i + ") Result:" + target);
		}

		ExtendedCommonTree target = tree.getNodeByPosition(54);
		System.out.println(49 + ") Result:" + target);

		// System.out.println("Declaration:" +
		// target.getDeclarationNode(target));
	}

	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 * @param indent
	 *            the indent
	 */
	public static void printTree(ExtendedCommonTree t, int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString()
						+ t.getChild(i).getText());
				printTree((ExtendedCommonTree) t.getChild(i), indent + 1);
			}
		}
	}
}
