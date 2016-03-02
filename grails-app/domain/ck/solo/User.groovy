package ck.solo

class User {

    String lastName
    String firstName
    String patronymic
    Date birthday
    String phone
    String organization
    String email
    Date dateCreated
    Date dateUpdated

    static constraints = {
        lastName blank: false
        firstName blank: false
        patronymic nullable: true
        birthday nullable: false
        phone nullable: true
        organization nullable: true
        email email: true, nullable: false
    }

    @Override
    public String toString() {
        "$lastName $firstName"
    }
}
