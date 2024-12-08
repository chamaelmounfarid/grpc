package ma.projet.grpc.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Compte {
    @Id
    private String id= UUID.randomUUID().toString(); ;
    private float solde;

    private String dateCreation;
    private String type;

    public String getId() {return id; }
    public void setId(String id) {this.id = id; }

    public float getSolde () {return solde; }
    public void setSolde (float solde) {this.solde = solde; }

    public String getDateCreation() {return dateCreation; }
    public void setDateCreation(String dateCreation) {this.dateCreation =
            dateCreation; }

    public String getType() {return type; }
    public void setType(String type) {this.type = type; }

}