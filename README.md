# plauscherl-WAT
Some random WAT examples inspired by Gary Bernhardt
https://www.destroyallsoftware.com/talks/wat

## Java

### Url equation
Set<URL> m = new HashSet<>();
m.add(new URL("http://www.google.at"));
System.out.println(m.contains(new URL("http://www.google.at")));
Thread.sleep(TimeUnit.MINUTES.toMillis(6));
System.out.println(m.contains(new URL("http://www.google.at")));

### Integer caching
int a = 1000, b = 1000;  
System.out.println(a == b); // true
Integer c = 1000, d = 1000;  
System.out.println(c == d); // false
Integer e = 100, f = 100;  
System.out.println(e == f); // true
