package org.ttbody.ttbodymodel

import org.ttbody.ttbodymodel.Customer
import org.ttbody.ttbodymodel.Event

data class Schedule(val user: Customer, val scheduleName: String, val eventList: List<Event>, val numPeople: Int)