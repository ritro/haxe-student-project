# Rules of naming variables #

**PRIVTE STATIC variables starts with underline character and then use the lower camel case
```
private static String _defaultName = "name";
```** PUBLIC STATIC variables can only be FINAL (or else use private variable and get/set method) use upper case and underline chars
```
public static final int DEFAULT_WIDTH = 300;
```
**in PRIVATE variables names just use lower camel case
```
private JPanel menuPanel;
```**

# Rules of naming methods and functions #
use lower camel case
```
public abstract String formatString(String unformattedString);
```