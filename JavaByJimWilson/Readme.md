1. Type name are qualified by their package name.
  eg if main class is in com.anurag package then Main class type name will be com.anurag.Main instead of Main
  type name is used to run the class.
  $ java com.anurag.Main

  sample issue related to it:

  C:\Users\anurag.kumar\repository\Java\JavaByJimWilson\target\classes>java App
  Error: Could not find or load main class App
  Caused by: java.lang.ClassNotFoundException: App

  C:\Users\anurag.kumar\repository\Java\JavaByJimWilson\target\classes>java com.anurag.commandlineapp.App
  Hello World!

2. variable can be declared final
