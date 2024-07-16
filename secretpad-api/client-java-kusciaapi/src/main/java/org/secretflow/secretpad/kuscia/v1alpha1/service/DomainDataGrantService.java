/*
 * Copyright 2024 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.kuscia.v1alpha1.service;

import org.secretflow.v1alpha1.kusciaapi.Domaindatagrant;

/**
 * @author yutu
 * @date 2024/06/17
 */
public interface DomainDataGrantService {

    Domaindatagrant.CreateDomainDataGrantResponse createDomainDataGrant(Domaindatagrant.CreateDomainDataGrantRequest request);

    Domaindatagrant.UpdateDomainDataGrantResponse updateDomainDataGrant(Domaindatagrant.UpdateDomainDataGrantRequest request);

    Domaindatagrant.DeleteDomainDataGrantResponse deleteDomainDataGrant(Domaindatagrant.DeleteDomainDataGrantRequest request);

    Domaindatagrant.QueryDomainDataGrantResponse queryDomainDataGrant(Domaindatagrant.QueryDomainDataGrantRequest request);

    Domaindatagrant.BatchQueryDomainDataGrantResponse batchQueryDomainDataGrant(Domaindatagrant.BatchQueryDomainDataGrantRequest request);

    Domaindatagrant.CreateDomainDataGrantResponse createDomainDataGrant(Domaindatagrant.CreateDomainDataGrantRequest request, String domainId);

    Domaindatagrant.UpdateDomainDataGrantResponse updateDomainDataGrant(Domaindatagrant.UpdateDomainDataGrantRequest request, String domainId);

    Domaindatagrant.DeleteDomainDataGrantResponse deleteDomainDataGrant(Domaindatagrant.DeleteDomainDataGrantRequest request, String domainId);

    Domaindatagrant.QueryDomainDataGrantResponse queryDomainDataGrant(Domaindatagrant.QueryDomainDataGrantRequest request, String domainId);

    Domaindatagrant.BatchQueryDomainDataGrantResponse batchQueryDomainDataGrant(Domaindatagrant.BatchQueryDomainDataGrantRequest request, String domainId);
}
