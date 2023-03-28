package fr.istic.taa.jaxrs.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("FicheFeatureRequest")
public class FicheFeatureRequest extends Fiche{

    public FicheFeatureRequest() {}

    public FicheFeatureRequest(String content, String date, User u, Membre m, List<String> s) {
        super(content, date, u, m, s);
    }


}
