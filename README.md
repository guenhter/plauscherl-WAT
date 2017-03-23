# plauscherl-WAT
Some random WAT examples inspired by Gary Bernhardt
https://www.destroyallsoftware.com/talks/wat


### JavaScript - Properties

```
  {}[0] == true
=> false
   {}[1] == true
=> true
   !{}[0] == true
=> true
   !{}[1] == true
=> true
```

### Java - Url equation
```
Set<URL> m = new HashSet<>();
m.add(new URL("http://www.google.at"));
System.out.println(m.contains(new URL("http://www.google.at")));
Thread.sleep(TimeUnit.MINUTES.toMillis(6));
System.out.println(m.contains(new URL("http://www.google.at")));
```

### Java - Integer caching
```
int a = 1000, b = 1000;  
System.out.println(a == b); // true
Integer c = 1000, d = 1000;  
System.out.println(c == d); // false
Integer e = 100, f = 100;  
System.out.println(e == f); // true
```

### C# - Magic nullable (1)

```
object a = null;
object a = new object();
object a = new Nullable<int>();

if (a == null) {
    Console.WriteLine("--- null");
} else {
    Console.WriteLine("not null");
}
```

### C# - Magic nullable (2)

```
object a = null;
Nullable<int> a = null;

a.ToString();
```


### C# - dynamic

```
dynamic a = null;
dynamic b = null;

Console.WriteLine( a - 42 == b);
```


### JavaScript - Object and Arrays
```
   [] + []
=> ''
   [] + {}
=> '[object Object]'
   {} + []
=> 0
   {} + {}
=> NaN
```