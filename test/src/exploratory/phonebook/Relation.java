package exploratory.phonebook;

import java.io.Serializable;
import java.util.Objects;

public class Relation implements Serializable{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relation relation = (Relation) o;
        return relationType == relation.relationType && Objects.equals(person, relation.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationType, person);
    }

    public enum RelationType {
        MOTHER,
        FATHER,
        SON,
        DAUGHTER
    }

    private RelationType relationType;
    private Person person;

    public Relation(RelationType relationType, Person person) {
        this.relationType = relationType;
        this.person = person;
    }


    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
    }

    public Person getRelation() {
        return person;
    }

    public void setRelation(Person person) {
        this.person = person;
    }
}
