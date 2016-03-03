package ck.solo

import grails.transaction.Transactional

import java.time.LocalDate
import java.time.Month

@Transactional
class PersonService {

    List<Person> getListOfBirthdaysToday() {
//        LocalDate localDate = LocalDate.now()
        LocalDate specificDate = LocalDate.of(1985, Month.DECEMBER, 11)
        Integer dayOfMonth = specificDate.getDayOfMonth()
        Integer month = specificDate.getMonth().getValue()
        Person.where {
            bday == dayOfMonth && bmonth == month
        }.list()
    }
}
