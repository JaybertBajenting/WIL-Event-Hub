package Capstone.Project.Backend.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_comments")

public class Comment {



    private Long id;

    private String commentName;

    private String comment;



    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
