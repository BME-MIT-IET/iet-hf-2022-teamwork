package exploratory.employee;

import com.complexible.pinto.annotations.RdfProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class EmployeeBook {

    @RdfProperty
    public ArrayList<Employee> getElements() {
        return elements;
    }


    public void setElements(ArrayList<Employee> elements) {
        this.elements = elements;
    }


    private ArrayList<Employee> elements = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}