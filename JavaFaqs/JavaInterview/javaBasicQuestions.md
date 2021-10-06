Core Java Basics:
---------------------
1. How compiler and javm run java code on different OS?

    .java---compiler--->.class----jvm---->executable file for machine of diff types.
2. Diff between  abstraction,encapsulation?  
3. What is bytecodes?

   .class file is called bytecode
4. Java  class can extends multiple class ?
   
    Java class can extends only one class.
5. Diff between implements and extends? 
6. Diff between signed left mshift operator and unsigned right shift operator? 
7. Return types needed to be same in overloaded methods?

    NO
8.Parent class has constructor with paramers and child class has no constructor.So if we create a object of child class then will it work?

    NO.sice child default constructor gonna call default constructor of super class.
9. Diff between parameter and arguments?  
10. What is the use of super keyword?

    To call parent constructor from child constructor.
11. What is the content of default constructor block?

    It contains call to parent default constructor by super().
12. How varargs treated by compiler?

    array.
13. Arguments are pass by value or pass by reference?

    Pass by value.
14. How to mark an object for garbage collection?

    By Setting all  references of object to null.
15. Is return type in overriding methods need to be same?

    No.covariant return type allowed.
16. Can we return a interface in method?

    yes.
17. Static methods can access static fields of the class but not instance methods /fields?

    Yes
18. Why static initialization blocks needed?

    To initialize static fields based on some logic.
19. How Instance initializer block works?

    Initializer block code gets copied by compiler to each constructor.
20. Non static nested class(Inner class ) vs static nested class?

    Inner class has access to all memebrs including private members of
    enclosing class and it cannot declare static memebr inside itself.
    Inner class instance can  exist only within enclosing class instance.
21. What is the values() method in Enum type?

    Enum class value() method return array of constant.
22. Can interface act as reference of instance?

    Interface can by used a reference for instance of class which implement
    that interface.
23.  Does subclass inherit constructor?

    No,since constructor are not members.
24. What is restriction on  access modifier in overriding method?

    Access modifier in overriding method can be same or of  larger acces
    but not lesser access.
25. Overriding Methods in subclass and super class need to be same type in terms of static/nonstatic ?
    
    Yes,they should be both Non static or both static(case of hiding methods)
26. How to acces overriden method from overriding method if needed?

    Use super keyword. super.methodName().
27. Final keyword use?

    final method  cant be overridden.  Final class cant be subclassed
28. Abstract class vs interface?  
29. What is generics?

    Generics enable types(class,interface) to be used as parameters while
    defining class,interface,method.
30. Benefits of generics?

    *Elimination of typecasting 
    *stronger type checks at compile time.
    *creating generic algorithm
31. Type parametr vs type argument.  
32. Type inference?  
33. Raw type?  
34. What is diff between static generic method  and non static generic method?

    *Static generic method need type parameters to be put before return type.
35. Is Abc<Number> class parent of Abc<Integer> class?

    NO
36. Bounded type parameter?

    Public <U extends Number> void  method(U a){
                      }
37. Wildcard types?

    *Upper bounded: > extends <class> If we want a method  to work with
        List<Number>,List<Integer>,List<Double> Then use List<? Extends
        Number>as parameter.  
    *Lower bounded:? super <class?  If we want a
        method  to work with List<Integer>,List<Number>,List<Object> Then use
        List<? Extends Number>as parameter.  
    *Unbounded:?  If you want method
        to accept List<String>,list<number>,List<Object> etc .

38. List<Integer> is subtype of List<? extends Integer> and List<? extends Integer> iis subtype of List<?> ?

    Yes
39. Type Erasure 
40. Restriction on generics?

    *type parameter instance cant be created.  
    *primitive type cant be used for type arguments.  
    *type parameter cant be used as type for static field in class 
    *type parameter cant be used as throwable object 
    *type parameter cant be used in typecast and instanceof opertaor.  
     *cant create array of parametrized type.
41. Restriction on File name ?

    It should be same as public type(may be a Class) declared in in that file.
42. Static import?

    Used to import all static members of class and now they can be used
    directly without referring to class.
43. What is autoboxing and unboxing?

44. String,StringBuilder,StringBuffer?  
45. Checked vs unchecked exception? 
46. Runtime and Error=unchecked exception?  
47. Use of finally block?  
48. Throw vs throws?  
49. Diff between collection and collections?  
50. Queue implementations?

    LinkList,PriorityQueue,ArrayBlockingQueue
51. Diff between hashtable and hashmap?
 
52. Collection views of map?

    keyset(),values(),entryset()
53. List implementations?

    Linklist,ArrayList
54. Iterator remove method is not thread safe?

    Yes
55. Synchronised wrappers in collections class?

    collections.synchronisedList() ,etc
56. Byte Streams?

    FileInputStream,BufferedInputStream, and so on..
57. Character stream?  
58. FileReader,BufferedFileReader, 
59. Bytestream to character stream converter?

    InputStreamReader and InputStreamWriter.
60. Paths class vs Files class?

    Thread vs process?
61. Thread interference example?  
62. Synchronised method and
    synchronized block?  
63. Constructor can be synchronised?
    NO
64. Intrinsic lock is associated with Object?
    Yes
65. A sample deadlock example?  
66. How to make a class Immutable ?

    *no setters *fields to be final and private 
    *make class final or constructor private so that class method cant be overridden in subclass.
    *mutable object should not return its reference *
67. AtomicInteger?  
68. concurrentHashMap,BlockingQueue?  
69. Producer consumer example with wait() and notifcy(). 
70. Reentrant lock?  
71.




