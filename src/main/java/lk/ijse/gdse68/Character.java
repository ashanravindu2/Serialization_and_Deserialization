package lk.ijse.gdse68;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int level;
    private double power;

}
