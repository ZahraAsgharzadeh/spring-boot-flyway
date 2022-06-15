package com.spring.boot.flyway.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "math")
public class Math {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_input", nullable = false)
    private int firstInput;

    @Column(name = "second_input", nullable = false)
    private int secondInput;

    @Column(name = "plus", nullable = false)
    private int plus;

    @Column(name = "minus", nullable = false)
    private int minus;

    public Math() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Math math = (Math) o;
        return firstInput == math.firstInput && secondInput == math.secondInput && plus == math.plus && minus == math.minus && Objects.equals(id, math.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstInput, secondInput, plus, minus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(int firstInput) {
        this.firstInput = firstInput;
    }

    public int getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(int secondInput) {
        this.secondInput = secondInput;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }
}
