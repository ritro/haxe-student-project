package workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapForLists<T> extends HashMap<String, List<T>>
{
    private static final long serialVersionUID = 3020235553509841732L;

    public void put(final String pack, final T node)
    {
        List<T> previous = get(pack);
        if (previous == null)
        {
            previous = new ArrayList<T>();
        }
        previous.add(node);
        put(pack, previous);
    }
    
    public List<T> getAll()
    {
        List<T> result = new ArrayList<T>();
        
        for (List<T> list : values())
        {
            result.addAll(list);
        }
            
        return result;        
    }
}
