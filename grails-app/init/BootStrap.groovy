import ck.solo.Person

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) createSampleData()
    }
    def destroy = {
    }

    private void createSampleData() {
        Person igor = new Person(lastName: 'Шкляр', firstName: 'Игорь', birthday: new Date().parse('dd.MM.yyyy', '11.12.1978'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        Person inna = new Person(lastName: 'Шкляр', firstName: 'Инна', birthday: new Date().parse('dd.MM.yyyy', '23.04.1985'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        Person person01 = new Person(lastName: 'Иванов', firstName: 'Иван', birthday: new Date('03/02/1985'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        Person person02 = new Person(lastName: 'Сидоров', firstName: 'Степан', birthday: new Date('03/02/1980'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
    }
}
