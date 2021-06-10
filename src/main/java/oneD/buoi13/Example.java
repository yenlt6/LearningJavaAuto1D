package oneD.buoi13;

public class Example {
    public StringBuilder usingReplace(StringBuilder str){
        str.replace(3,9,"Java");
        return str;
    }

    public StringBuilder usingDelete(StringBuilder str){
        str.delete(0,9);
        return str;
    }
}
