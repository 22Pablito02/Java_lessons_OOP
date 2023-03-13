package FinalWorkOOP;

import java.util.Objects;

public class Innerapp {
    IInterface v;

    public Innerapp(IInterface v){
        this.v =  Objects.requireNonNullElseGet(v, NullInterface::new);
    }

    void write() {
        v.print();
    }
}