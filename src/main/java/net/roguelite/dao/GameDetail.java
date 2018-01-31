package net.roguelite.dao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAME")
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
        private int artifacts;

        @Column(nullable = false)
        private int creatures;

        @Column(nullable = false)
        private int planeswalkers;

        @Column(nullable = false)
        private int enchantments;

        @Column(nullable = false)
        private int instants;

        @Column(nullable = false)
        private int sorceries;

        @Column(nullable = false)
        private int turns;

        @Column(nullable = false)
        private String notes;
}