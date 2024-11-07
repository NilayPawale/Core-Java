# String Class API

Important String class constructors

1) String(byte[] bytes) --- byte[] ----> String converter
Constructs a new String by decoding the specified array of bytes using the platform's default charset.

2) String(char[] chars)   --- char[] ---> String converter
Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.

3) String (byte[] bytes, int offset, int length)  ---byte[] ----> String converter from the specified offset, specified length number of bytes will be converted.
Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.
eg . String s=new String(bytes,3,4);   --- String will contain bytes[3]----bytes[6]

4) String(char[] ch,int offset,int count)
Allocates a new String that contains characters from a subarray of the character array argument.

5) String(String s)
Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.

## String class methods

### charAt​(int index)
- Modifier and Type - char
- Description - Returns the char value at the specified index.

### compareTo​(String anotherString)
- Modifier and Type - int
- Description - Compares two strings lexicographically.

### concat​(String str)
- Modifier and Type - String
- Description - Concatenates the specified string to the end of this string.

### contains​(CharSequence s)
- Modifier and Type - boolean
- Description - Returns true if and only if this string contains the specified sequence of char values.

### copyValueOf​(char[] data)
- Modifier and Type - static String
- Description - Equivalent to valueOf(char[]).

### copyValueOf​(char[] data, int offset, int count)
- Modifier and Type - static String
- Description - Equivalent to valueOf(char[], int, int).

### format​(String format, Object... args)
- Modifier and Type - static String
- Description - Returns a formatted string using the specified format string and arguments.

### format​(String format, Object... args)
- Modifier and Type - static String
- Description - Returns a formatted string using the specified locale, format string, and arguments.

### valueOf​(char c)
- Modifier and Type - static String
- Description - Returns the string representation of the char argument.
- This method can be used with - boolean, char[], double, float, int, long, Object, char[] int offset int count 

### getBytes()
- Modifier and Type - byte[]
- Description - Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.

### toCharArray()
- Modifier and Type - char[]
- Description - Converts this string to a new character array.

### toLowerCase()
- Modifier and Type - String
- Description - Converts all of the characters in this String to lower case using the rules of the default locale.

### indexOf​(int ch)
- Modifier and Type - int
- Description - Returns the index within this string of the first occurrence of the specified character.

### lastIndexOf​(int ch)
- Modifier and Type - int
- Description - Returns the index within this string of the last occurrence of the specified character.

### split​(String regex)
- Modifier and Type - String[]
- Description - Splits this string around matches of the given regular expression.

### replace​(char oldChar, char newChar)
- Modifier and Type - String
- Description - Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.

### startsWith​(String prefix)
- Modifier and Type - boolean
- Description - Tests if this string starts with the specified prefix.

### endsWith​(String suffix)
- Modifier and Type - boolean
- Description - Tests if this string ends with the specified suffix.

### length()
- Modifier and Type - int
- Description - Returns the length of this string.

### intern()
- Modifier and Type - String
- Description - Returns a canonical representation for the string object.

