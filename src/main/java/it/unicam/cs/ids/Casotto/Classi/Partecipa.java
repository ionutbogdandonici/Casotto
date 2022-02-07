package it.unicam.cs.ids.Casotto.Classi;

import javax.persistence.*;

@Entity
@SuppressWarnings("unused")
public class Partecipa {

    @Id
    @GeneratedValue
    private long id;
    private int numPartecipanti;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "partecipante_id", nullable = false)
    private Account partecipante;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "attività_id", nullable = false)
    private Attivita attivita;

    public Partecipa() {
    }

    public Partecipa(int numPartecipanti, Account partecipante, Attivita attivita) {
        this.numPartecipanti = numPartecipanti;
        this.partecipante = partecipante;
        this.attivita = attivita;
    }

    public long getId() {
        return this.id;
    }

    public int getNumPartecipanti() {
        return this.numPartecipanti;
    }
}