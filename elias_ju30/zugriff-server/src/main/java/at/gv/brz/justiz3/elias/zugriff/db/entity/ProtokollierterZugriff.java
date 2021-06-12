package at.gv.brz.justiz3.elias.zugriff.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Date;

@Table(name = "PROTOKOLLIERTER_ZUGRIFF")
@Entity
public class ProtokollierterZugriff {

    @Id
    @Column(name = "INTERNALID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zugriff_gen")
    @SequenceGenerator(name="zugriff_gen", sequenceName="ZUGRIFF_PK_SEQUENCE")
    private Long internalId;

    @Column(name = "AKTIVIERUNG_TS")
    private Date aktivierungTs;

    @Column(name = "DEAKTIVIERUNG_TS")
    private Date deaktivierungTs;

    @Column(name = "AKTID")
    private Integer aktId;

    @Column(name = "KENNUNG")
    private String kennung;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "AKTIV")
    private Boolean aktiv;

    public Long getInternalId() {
        return internalId;
    }

    public Date getAktivierungTs() {
        return aktivierungTs;
    }

    public Date getDeaktivierungTs() {
        return deaktivierungTs;
    }

    public Integer getAktId() {
        return aktId;
    }

    public String getKennung() {
        return kennung;
    }

    public String getText() {
        return text;
    }

    public boolean isAktiv() {
        return aktiv;
    }
}
