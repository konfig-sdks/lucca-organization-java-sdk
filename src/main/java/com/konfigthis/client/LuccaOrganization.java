package com.konfigthis.client;

import com.konfigthis.client.api.AxisSectionsApi;
import com.konfigthis.client.api.DepartmentsApi;

public class LuccaOrganization {
    private ApiClient apiClient;
    public final AxisSectionsApi axisSections;
    public final DepartmentsApi departments;

    public LuccaOrganization() {
        this(null);
    }

    public LuccaOrganization(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.axisSections = new AxisSectionsApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
    }

}
