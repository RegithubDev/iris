/*=========================================================================================
  File Name: form-validation.js
  Description: jquery bootstrap validation js
  ----------------------------------------------------------------------------------------
  Item Name: Vuexy  - Vuejs, HTML & Laravel Admin Dashboard Template
  Author: PIXINVENT
  Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/

$(function () {
  'use strict';

  var bootstrapForm = $('.needs-validation'),
    jqForm = $('#jquery-val-form'),
    picker = $('.picker'),
    select = $('.select2');

  // select2
  select.each(function () {
    var $this = $(this);
    $this.wrap('<div class="position-relative"></div>');
    $this
      .select2({
        placeholder: 'Select value',
        dropdownParent: $this.parent()
      })
      .change(function () {
        $(this).valid();
      });
  });

  // Picker
  if (picker.length) {
    picker.flatpickr({
      allowInput: true,
      onReady: function (selectedDates, dateStr, instance) {
        if (instance.isMobile) {
          $(instance.mobileInput).attr('step', null);
        }
      }
    });
  }

  // Bootstrap Validation
  // --------------------------------------------------------------------
  if (bootstrapForm.length) {
    Array.prototype.filter.call(bootstrapForm, function (form) {
      form.addEventListener('submit', function (event) {
        if (form.checkValidity() === false) {
          form.classList.add('invalid');
        }
        form.classList.add('was-validated');
        event.preventDefault();
        // if (inputGroupValidation) {
        //   inputGroupValidation(form);
        // }
      });
      // bootstrapForm.find('input, textarea').on('focusout', function () {
      //   $(this)
      //     .removeClass('is-valid is-invalid')
      //     .addClass(this.checkValidity() ? 'is-valid' : 'is-invalid');
      //   if (inputGroupValidation) {
      //     inputGroupValidation(this);
      //   }
      // });
    });
  }

  // jQuery Validation
  // --------------------------------------------------------------------
  if (jqForm.length) {
    jqForm.validate({
      rules: {
        'user_name': {
          required: true
        },
        'email_id': {
          required: true,
          email: true
        },
        'basic-default-password': {
          required: true
        },
        'confirm-password': { 
          required: true,
          equalTo: '#basic-default-password'
        },
        'sbu': {
          required: true
        },
        'city': {
          required: true
        },
        'roles': {
          required: true
        },
        'site_name': {
          required: true
        },
        'mobile_number': {
          required: true
        },
        'categories': {
          required: true
        },
        customFile: {
          required: true
        },
        'validationRadiojq': {
          required: true
        },
        'validationBiojq': {
          required: true
        },
        'validationCheck': {
          required: true
        },
		'sbu_code':{
          required: true
        },
		'sbu_name':{
          required: true
        },
		'status':{
          required: true
        },
		'category_name':{
          required: true
        },
		'category_code':{
          required: true
        },
		'state_name':{
          required: true
        },
		'state_code':{
          required: true
        },
		'state':{
          required: true
        },
		'city_name':{
          required: true
        },
		'role_name':{
          required: true
        },
		
		
		
		
      }
    });
  }
});

$(function () {
  'use strict';

  var bootstrapForm = $('.needs-validation'),
    jqForm = $('#jquery-val-form2'),
    picker = $('.picker'),
    select = $('.select2');

  // select2
  select.each(function () {
    var $this = $(this);
    $this.wrap('<div class="position-relative"></div>');
    $this
      .select2({
        placeholder: 'Select value',
        dropdownParent: $this.parent()
      })
      .change(function () {
        $(this).valid();
      });
  });

  // Picker
  if (picker.length) {
    picker.flatpickr({
      allowInput: true,
      onReady: function (selectedDates, dateStr, instance) {
        if (instance.isMobile) {
          $(instance.mobileInput).attr('step', null);
        }
      }
    });
  }

  // Bootstrap Validation
  // --------------------------------------------------------------------
  if (bootstrapForm.length) {
    Array.prototype.filter.call(bootstrapForm, function (form) {
      form.addEventListener('submit', function (event) {
        if (form.checkValidity() === false) {
          form.classList.add('invalid');
        }
        form.classList.add('was-validated');
        event.preventDefault();
        // if (inputGroupValidation) {
        //   inputGroupValidation(form);
        // }
      });
      // bootstrapForm.find('input, textarea').on('focusout', function () {
      //   $(this)
      //     .removeClass('is-valid is-invalid')
      //     .addClass(this.checkValidity() ? 'is-valid' : 'is-invalid');
      //   if (inputGroupValidation) {
      //     inputGroupValidation(this);
      //   }
      // });
    });
  }

  // jQuery Validation
  // --------------------------------------------------------------------
  if (jqForm.length) {
    jqForm.validate({
      rules: {
        'user_name': {
          required: true
        },
        'email_id': {
          required: true,
          email: true
        },
        'basic-default-password': {
          required: true
        },
        'confirm-password': { 
          required: true,
          equalTo: '#basic-default-password'
        },
        'sbu': {
          required: true
        },
        'city': {
          required: true
        },
        'roles': {
          required: true
        },
        'site_name': {
          required: true
        },
        'mobile_number': {
          required: true
        },
        'categories': {
          required: true
        },
        customFile: {
          required: true
        },
        'validationRadiojq': {
          required: true
        },
        'validationBiojq': {
          required: true
        },
        'validationCheck': {
          required: true
        },
		'sbu_code':{
          required: true
        },
		'sbu_name':{
          required: true
        },
		'status':{
          required: true
        },
		'category_name':{
          required: true
        },
		'category_code':{
          required: true
        },
		'state_name':{
          required: true
        },
		'state_code':{
          required: true
        },
		'state':{
          required: true
        },
		'city_name':{
          required: true
        },
		'role_name':{
          required: true
        },
		'quantity':{
          required: true
        },
		'quantity_measure':{
          required: true
        }
		
		
		
      }
    });
  }
});
