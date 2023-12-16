package com.anurag.SerializationAndDeserialization;


import java.io.*;

class Data implements Serializable {

    private static final long serialVersionUID= -8657851947815483759L;
    String content;

    public Data(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private static class DataProxy implements Serializable{

        private final static long serialVersionUID= 6195722258788194111L;

        String PREFIX="PREFIX";
        String SUFFIX="SUFFIX";
        String proxyData="";

        DataProxy(Data data) {
             proxyData=PREFIX+data.content+SUFFIX;

        }
       Object readResolve() throws IOException, ClassNotFoundException {

           System.out.println("testing again:"+proxyData);
           if(proxyData.startsWith(PREFIX) && proxyData.endsWith(SUFFIX)){
               return new Data(proxyData.substring(PREFIX.length(),proxyData.length()-SUFFIX.length()));
           }

           throw new InvalidObjectException("data corrupted");
        }


    }

    Object writeReplace(){

        return new DataProxy(this);
    }
    Object readObject() throws InvalidObjectException {
        throw new InvalidObjectException("read object not allowed");
    }

    @Override
    public String toString() {
        return "Data{" +
                "content='" + content + '\'' +
                '}';
    }
}

public class SerializationProxyPattern {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Data data=new Data("this is secret");
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("proxy.txt"));
        out.writeObject(data);

        ObjectInputStream input=new ObjectInputStream(new FileInputStream("proxy.txt"));

        Data dataToRead = (Data)input.readObject();
        System.out.println(dataToRead);
    }

}
