package warriordiningback.domain;

import jakarta.persistence.*;
import lombok.Getter;
import warriordiningback.domain.user.User;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "codes")
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String value;

    private String comment;

    @OneToMany(mappedBy = "code")
    private List<User> users = new ArrayList<>();

}
