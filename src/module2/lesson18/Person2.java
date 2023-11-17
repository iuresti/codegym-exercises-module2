package module2.lesson18;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Person2 {
    private String name;
    private int live;
    private int strength;
    private int magic;
    private int attack;
    private int defense;

}
