package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "operator_table")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kod_operator")
    private int kod_operator;

    @Column(name = "name_operator")
    private String name_operator;

    @JsonManagedReference
    @OneToMany(mappedBy = "operator",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Subscribers> subscribers;


}
