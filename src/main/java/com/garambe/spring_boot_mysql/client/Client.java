package com.garambe.spring_boot_mysql.client;


import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column( name = "idclient")
        Integer idclient;

        String nom;

        String prenom;

        public Client() {
        }
        public Client(Integer idclient, String nom, String prenom) {
                this.idclient = idclient;
                this.nom = nom;
                this.prenom = prenom;
        }

        public Integer getIdclient() {
                return idclient;
        }

        public void setIdclient(Integer idclient) {
                this.idclient = idclient;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        @Override
        public String toString() {
                return "Client{" +
                        "idclient=" + idclient +
                        ", nom='" + nom + '\'' +
                        ", prenom='" + prenom + '\'' +
                        '}';
        }
}
