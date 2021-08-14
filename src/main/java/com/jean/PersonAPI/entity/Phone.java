package com.jean.PersonAPI.entity;
import com.jean.PersonAPI.enums.PhoneType;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //NOT NULL
    private PhoneType type;

    @Column(nullable = false)
    private  String number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Phone phone = (Phone) o;

        return Objects.equals(id, phone.id);
    }

    @Override
    public int hashCode() {
        return 745010098;
    }
}