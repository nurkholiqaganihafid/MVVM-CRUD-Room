package com.nurkholiq.mvvm_curd_room.db

import androidx.room.Dao

class SubscriberRepository(private val dao: SubscriberDAO) {

    val subscribers = dao.getAllSubscriber()

    suspend fun insert(subscriber: Subscriber) : Long{
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber) {
        dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber) {
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll() {
        dao.deleteAll()
    }
}