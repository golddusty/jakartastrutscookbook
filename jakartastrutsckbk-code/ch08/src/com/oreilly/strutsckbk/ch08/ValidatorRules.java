package com.oreilly.strutsckbk.ch08;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.Resources;

public class ValidatorRules {
    
    public static boolean validateMinChoices(Object bean, ValidatorAction va, 
            Field field, ActionMessages errors, HttpServletRequest request) {
        try {
            Object values = PropertyUtils.getProperty(bean, field.getProperty());
            int minChoices = Integer.parseInt(field.getVarValue("minChoices"));
            if (!(values == null)) {
                int numChoices = 0;
                if (values instanceof Object[]) {
                    numChoices = ((Object[])values).length;
                }
                else if (values instanceof Collection) {
                    numChoices = ((Collection) values).size();
                }
                else {
                    errors.add(field.getKey(),
                            Resources.getActionMessage(request, va, field));
                    return false;                    
                }
                if (numChoices < minChoices) {
                    errors.add(field.getKey(),
                               Resources.getActionMessage(request, va, field));
                    return false;
                }  
            }
        }
        catch (Exception e) {
            errors.add(field.getKey(),
                    Resources.getActionMessage(request, va, field));
            return false;
        }
        
        return true;
    }
}