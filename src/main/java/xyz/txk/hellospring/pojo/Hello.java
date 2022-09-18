package xyz.txk.hellospring.pojo;

public class Hello {
    private String str;

    public Hello() {
//        System.out.println("无参构造");
    }

    public Hello(String str) {
        System.out.println("有参构造");
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
//        System.out.println("1234567");
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
