package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog extends Animal {
    public String toString() {
        return "Im a Dog";
    }
}
