package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content", length = 255, nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id セットする id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content セットする content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return created_at
     */
    public Timestamp getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at セットする created_at
     */
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    /**
     * @return updated_at
     */
    public Timestamp getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at セットする updated_at
     */
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

}
