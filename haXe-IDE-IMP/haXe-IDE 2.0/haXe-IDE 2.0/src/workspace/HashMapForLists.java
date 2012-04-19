package workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapForLists<T> extends HashMap<String, List<T>>
{
    private static final long serialVersionUID = 3020235553509841732L;

    public void put(final String key, final T value)
    {
        List<T> previous = get(key);
        if (previous == null)
        {
            previous = new ArrayList<T>();
        }
        previous.add(value);
        put(key, previous);
    }
    
    /**
     * Mixes all lists in this HashMap to a single list
     * and returns that.
     * @return the list of all values in this container
     */
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
