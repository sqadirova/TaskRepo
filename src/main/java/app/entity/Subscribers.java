package app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "subscribers_table")
public class Subscribers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kod_abonent")
    private int kod_abonent;

    @Column(name = "name_abonent")
    private String name_abonent;

    @Column(name = "telephone_num_abonent")
    private String telephone_num_abonent;

    @Column(name = "adres_abonent")
    private String adres_abonent;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "r_operator_subscribers",
            joinColumns = { @JoinColumn(
                    name = "id_subscriber",
                    referencedColumnName = "kod_abonent") },
            inverseJoinColumns = { @JoinColumn(
                    name = "id_operator",
                    referencedColumnName = "kod_operator") }
    )
    private Operator operator;


    @Column(name = "creation_date")
    private String creation_date;

    public Subscribers(String name_abonent,String adres_abonent,String telephone_num_abonent,String creation_date) {
        this.name_abonent=name_abonent;
        this.adres_abonent=adres_abonent;
        this.telephone_num_abonent=telephone_num_abonent;
        this.creation_date=creation_date;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "kod_abonent=" + kod_abonent +
                ", name_abonent='" + name_abonent + '\'' +
                ", telephone_num_abonent='" + telephone_num_abonent + '\'' +
                ", adres_abonent='" + adres_abonent + '\'' +
              //  ", operator=" + operator +
                ", creation_date='" + creation_date + '\'' +
                '}';
    }
}
