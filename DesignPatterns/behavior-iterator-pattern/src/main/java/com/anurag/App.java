package com.anurag;

interface Iterator{
    boolean hasNext();
    String next();
}

interface Container{
    Iterator getIterator();

}
class NameRepository implements Container{

    String names[];

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int count;
        public NameIterator() {
            count=0;
        }

        @Override
        public boolean hasNext() {
            return count<names.length;
        }

        @Override
        public String next() {
            return names[count++];

        }
    }
}
public class App 
{
    public static void main( String[] args ) {

        NameRepository repo = new NameRepository(new String[]{"anu","sonu","gonu"});



        for(Iterator it=repo.getIterator();it.hasNext();){
            System.out.println(it.next());
        }


    }
}
