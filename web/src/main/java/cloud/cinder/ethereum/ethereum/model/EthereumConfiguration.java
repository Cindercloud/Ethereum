package cloud.cinder.ethereum.ethereum.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ethereum_configurations")
public class EthereumConfiguration {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;


    @Column(name = "active")
    private boolean active;


    public Long getId() {
        return id;
    }

    public EthereumConfiguration setId(final Long id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public EthereumConfiguration setUserId(final String userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public EthereumConfiguration setName(final String name) {
        this.name = name;
        return this;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public EthereumConfiguration setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public EthereumConfiguration setActive(final boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final EthereumConfiguration that = (EthereumConfiguration) o;

        if (active != that.active) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return creationDate != null ? creationDate.equals(that.creationDate) : that.creationDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
