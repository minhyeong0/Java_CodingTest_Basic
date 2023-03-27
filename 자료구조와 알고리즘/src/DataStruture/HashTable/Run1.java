package DataStruture.HashTable;

public class Run1 {
    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee", "01011112222");
        mainObject.saveData("David", "01022223333");
        mainObject.saveData("Dave", "01033334444");
        mainObject.saveData("fun-coding", "01044445555");


        System.out.println(mainObject.getData("DaveLee"));
        System.out.println(mainObject.getData("David"));
        System.out.println(mainObject.getData("Dave"));
        System.out.println(mainObject.getData("fun-coding"));
    }
}
