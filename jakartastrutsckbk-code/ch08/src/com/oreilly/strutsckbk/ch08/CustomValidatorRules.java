package com.oreilly.strutsckbk.ch08;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.Resources;

public class CustomValidatorRules {
    
    public static boolean validateTwoFields(Object bean, ValidatorAction va,
            Field field, ActionErrors errors, HttpServletRequest request) {
        String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
        String sProperty2 = field.getVarValue("secondProperty");
        String value2 = ValidatorUtils.getValueAsString(bean, sProperty2);
        
        if (!GenericValidator.isBlankOrNull(value)) {
            try {
                if (!value.equals(value2)) {
                    errors.add(
                            field.getKey(),
                            Resources.getActionError(request, va, field));
                    return false;
                }
            } catch (Exception e) {
                errors.add(
                        field.getKey(),
                        Resources.getActionError(request, va, field));
                return false;
            }
        }

        return true;
    } 
    public static boolean validateMinChoose(Object bean, ValidatorAction va, 
            Field field, ActionMessages errors, HttpServletRequest request) {
        try {
            Object[] values = (Object[]) PropertyUtils.getProperty(bean, field.getProperty());
            int min = Integer.parseInt(field.getVarValue("minChoose"));
            if (values == null || values.length < min) {
                errors.add(field.getKey(),
                           Resources.getActionMessage(request, va, field));
                return false;
            }  
        } catch (Exception e) {
            // silently ignore
        }
        return true;
    }}