package it.unicam.cs.ids.Casotto.Classi;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Classe che rappresenta l'entit&agrave; 'Utente', che viene associato ad 1 {@link Account}
 *
 */
@Entity(name = "utente")
@SuppressWarnings("unused")
public class Utente
{
    @Id
    @GeneratedValue
    @Column(name = "ID_Utente")
    private long id;

    @NotNull
    @Column(name = "Nome")
    private String nome;

    @NotNull
    @Column(name = "Cognome")
    private String cognome;

    @NotNull
    @Column(name = "Data_Nascita")
    private LocalDate dataNascita;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "utente")
    private Account account;

    /**
     * Costruttore di default che inizializza un utente per la creazione della corrispondente tabella nel database
     *
     */
    Utente() {
    }

    /**
     * Costruttore che inizializza un utente con i parametri passati: questi NON possono essere nulli
     *
     * @param nome nome dell'utente
     * @param cognome cognome dell'utente
     * @param dataNascita data di nascita dell'utente
     */
    public Utente(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    /**
     * Restituisce l'identificativo dell'utente
     *
     * @return l'identificativo dell'utente
     */
    public long getId() {
        return this.id;
    }

    /**
     * Restituisce il nome dell'utente
     *
     * @return il nome dell'utente
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Imposta come nome dell'utente il nome passato come parametro
     *
     * @param nome nome dell'utente
     */
    public void setNome(String nome) {this.nome = nome;}

    /**
     * Restituisce il cognome dell'utente
     *
     * @return il cognome dell'utente
     */
    public String getCognome() {
        return this.cognome;
    }

    /**
     * Imposta come cognome dell'utente il cognome passato come parametro
     *
     * @param cognome nome dell'utente
     */
    public void setCognome(String cognome) {this.cognome = cognome;}

    /**
     * Restituisce la data di nascita dell'utente
     *
     * @return la data di nascita dell'utente
     */
    public LocalDate getDataNascita() {
        return this.dataNascita;
    }

    /**
     * Imposta come data di nascita dell'utente la data passata come parametro
     *
     * @param dataNascita data di nascita dell'utente
     */
    public void setDataNascita(LocalDate dataNascita) {this.dataNascita = dataNascita;}

    /**
     * Restituisce l'{@link Account} associato all'utente
     *
     * @return l'{@link Account}s associato all'utente
     */
    public Account getAccount() {
        return this.account;
    }

}