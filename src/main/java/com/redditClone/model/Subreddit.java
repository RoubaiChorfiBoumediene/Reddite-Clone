package com.redditClone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name is required in this community")
    private String name ;

    @NotBlank(message = "descriptio is required ")
    private String description ;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Post> posts;
    private Instant createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
