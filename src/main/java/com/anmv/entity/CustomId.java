package com.anmv.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "custom_id", catalog = "dev")
public class CustomId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "`code`")
    @Id
    @GenericGenerator(
            name = "custom-code-generator",
            strategy = "com.anmv.entity.CustomIdCodeGenerator"
    )
    @GeneratedValue(generator = "custom-code-generator")
    private String code;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "`type`", length = 50, nullable = false)
    private String type;

    public CustomId() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
