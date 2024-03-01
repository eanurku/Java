1.create a sub project:
mvn archetype:generate -DgroupId="com.anurag" -DartifactId=DataStructures -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

2.create .gitignore file with contents:
 target/

3.generate  serialVersionUID for a class
 * Ctrl+shift+A ,then search for "serializable class without 'serialversionuid'"
 * enable this feature button
 * Ctrl+enter on class and option to generate serialVersionUID will be visible.

4. class to be serialized/deserialized should have default constructor else readObject() method throws error  " no valid constructor"