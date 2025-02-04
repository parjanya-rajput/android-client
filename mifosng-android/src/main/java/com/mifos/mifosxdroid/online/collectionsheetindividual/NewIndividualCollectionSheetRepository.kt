package com.mifos.mifosxdroid.online.collectionsheetindividual

import com.mifos.api.model.RequestCollectionSheetPayload
import com.mifos.objects.collectionsheet.IndividualCollectionSheet
import com.mifos.objects.organisation.Office
import com.mifos.objects.organisation.Staff
import rx.Observable

/**
 * Created by Aditya Gupta on 10/08/23.
 */
interface NewIndividualCollectionSheetRepository {

    fun getIndividualCollectionSheet(
        payload: RequestCollectionSheetPayload?
    ): Observable<IndividualCollectionSheet>

    fun offices(): Observable<List<Office>>

    fun getStaffInOffice(officeId: Int): Observable<List<Staff>>

}