import ck.solo.User

class BootStrap {

    def init = { servletContext ->
        if (!User.count()) createSampleData()
    }
    def destroy = {
    }

    private void createSampleData() {
        User igor = new User(lastName: 'Шкляр', firstName: 'Игорь', birthday: new Date().parse('dd.MM.yyyy', '11.12.1978'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        User inna = new User(lastName: 'Шкляр', firstName: 'Инна', birthday: new Date().parse('dd.MM.yyyy', '23.04.1985'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        User user01 = new User(lastName: 'Иванов', firstName: 'Иван', birthday: new Date('03/02/1985'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
        User user02 = new User(lastName: 'Сидоров', firstName: 'Степан', birthday: new Date('03/02/1980'), dateCreated: new Date('02/02/2016'), dateUpdated: new Date('02/02/2016')).save(failOnError: true)
    }
}
