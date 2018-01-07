package net.roguelite.dao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GameDetail implements Serializable {
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue
        private Long id;

        @Column(nullable = false)
        private Long gameId;

        @Column(nullable = false)
        private String player;

        @Column(nullable = false)
        private String deck;

        @Column(nullable = false)
        private boolean win;

        @Column(nullable = false)
        private int kills;

        @Column(nullable = false)
        private String keyCards;

        @Column(nullable = false)
        private String notes; 
}