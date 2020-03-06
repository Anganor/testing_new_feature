package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFecade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFecade.class);

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> searchCompanyByName(final String companyName) throws SearchExceptions {
        List<Company> searchResults = companyDao.retrieveCompanyByName(companyName);
        if (searchResults.size() == 0) {
            LOGGER.info(SearchExceptions.ERR_COMPANY_NOT_FOUND);
            throw new SearchExceptions(SearchExceptions.ERR_COMPANY_NOT_FOUND);
        } else {
            return searchResults;
        }
    }
}
