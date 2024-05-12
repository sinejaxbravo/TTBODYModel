package org.ttbody.ttbodymodel


data class Event(val title: String, val description: String,
                 val cost: Double, val eventCategory: EventCategory, val bookingType: BookingType,
                 val location: Location, val time: Time
) {


    enum class BookingType {
//    OpenTable: Unit,
//    Cell: Unit,

    }

    enum class EventCategory {
//    NightLife: Unit,
//    Dining: Unit,
//    Lodge: Unit,
//    Activity: Unit,
//    Transportation: Unit
    }
}