(ns com.wsscode.tailwind-garden.components.forms)

(defn forms []
  [["[type='text']"
    "[type='email']"
    "[type='url']"
    "[type='password']"
    "[type='number']"
    "[type='date']"
    "[type='datetime-local']"
    "[type='month']"
    "[type='search']"
    "[type='tel']"
    "[type='time']"
    "[type='week']"
    "[multiple]"
    "textarea"
    "select"
    {:-webkit-appearance "none"
     :-moz-appearance    "none"
     :appearance         "none"
     :background-color   "#fff"
     :border-color       "#6b7280"
     :border-width       "1px"
     :border-radius      "0px"
     :padding-top        "0.5rem"
     :padding-right      "0.75rem"
     :padding-bottom     "0.5rem"
     :padding-left       "0.75rem"
     :font-size          "1rem"
     :line-height        "1.5rem"}]

   ["[type='text']:focus"
    "[type='email']:focus"
    "[type='url']:focus"
    "[type='password']:focus"
    "[type='number']:focus"
    "[type='date']:focus"
    "[type='datetime-local']:focus"
    "[type='month']:focus"
    "[type='search']:focus"
    "[type='tel']:focus"
    "[type='time']:focus"
    "[type='week']:focus"
    "[multiple]:focus"
    "textarea:focus"
    "select:focus"
    {:outline                 "2px solid transparent"
     :outline-offset          "2px"
     :--tw-ring-inset         "var (--tw-empty, /*!*/ /*!*/)"
     :--tw-ring-offset-width  "0px"
     :--tw-ring-offset-color  "#fff"
     :--tw-ring-color         "#2563eb"
     :--tw-ring-offset-shadow "var (--tw-ring-inset) 0 0 0 var (--tw-ring-offset-width) var (--tw-ring-offset-color)"
     :--tw-ring-shadow        "var (--tw-ring-inset) 0 0 0 calc (1px + var (--tw-ring-offset-width)) var (--tw-ring-color)"
     :box-shadow              "var (--tw-ring-offset-shadow), var (--tw-ring-shadow), var (--tw-shadow, 0 0 #0000)"
     :border-color            "#2563eb"}]

   ["input::-moz-placeholder"
    "textarea::-moz-placeholder"
    "input:-ms-input-placeholder"
    "textarea:-ms-input-placeholder"
    "input::placeholder"
    "textarea::placeholder"
    {:color   "#6b7280"
     :opacity "1"}]

   ["::-webkit-datetime-edit-fields-wrapper"
    {:padding "0"}]

   ["::-webkit-date-and-time-value"
    {:min-height "1.5em"}]

   ["select"
    {:background-image           "url(\"data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 20 20'%3e%3cpath stroke='%236b7280' stroke-linecap='round' stroke-linejoin='round' stroke-width='1.5' d='M6 8l4 4 4-4'/%3e%3c/svg%3e\")"
     :background-position        "right 0.5rem center"
     :background-repeat          "no-repeat"
     :background-size            "1.5em 1.5em"
     :padding-right              "2.5rem"
     :-webkit-print-color-adjust "exact"
     :color-adjust               "exact"}]

   ["[multiple]"
    {:background-image           "initial"
     :background-position        "initial"
     :background-repeat          "unset"
     :background-size            "initial"
     :padding-right              "0.75rem"
     :-webkit-print-color-adjust "unset"
     :color-adjust               "unset"}]

   ["[type='checkbox']"
    "[type='radio']"
    {:-webkit-appearance         "none"
     :-moz-appearance            "none"
     :appearance                 "none"
     :padding                    "0"
     :-webkit-print-color-adjust "exact"
     :color-adjust               "exact"
     :display                    "inline-block"
     :vertical-align             "middle"
     :background-origin          "border-box"
     :-webkit-user-select        "none"
     :-moz-user-select           "none"
     :-ms-user-select            "none"
     :user-select                "none"
     :flex-shrink                "0"
     :height                     "1rem"
     :width                      "1rem"
     :color                      "#2563eb"
     :background-color           "#fff"
     :border-color               "#6b7280"
     :border-width               "1px"}]

   ["[type='checkbox']"
    {:border-radius "0"}]

   ["[type='radio']"
    {:border-radius "100%"}]

   ["[type='checkbox']:focus"
    "[type='radio']:focus"
    {:outline                 "2px solid transparent"
     :outline-offset          "2px"
     :--tw-ring-inset         "var(--tw-empty, /*!*/ /*!*/)"
     :--tw-ring-offset-width  "2px"
     :--tw-ring-offset-color  "#fff"
     :--tw-ring-color         "#2563eb"
     :--tw-ring-offset-shadow "var(--tw-ring-inset) 0 0 0 var(--tw-ring-offset-width) var(--tw-ring-offset-color)"
     :--tw-ring-shadow        "var(--tw-ring-inset) 0 0 0 calc(2px + var(--tw-ring-offset-width)) var(--tw-ring-color)"
     :box-shadow              "var(--tw-ring-offset-shadow), var(--tw-ring-shadow), var(--tw-shadow, 0 0 #0000)"
     :border-color            "#6b7280"}]

   ["[type='checkbox']:checked"
    "[type='radio']:checked"
    {:border-color        "transparent"
     :background-color    "currentColor"
     :background-size     "100% 100%"
     :background-position "center"
     :background-repeat   "no-repeat"}]

   ["[type='checkbox']:checked"
    {:background-image "url(\"data:image/svg+xml,%3csvg viewBox='0 0 16 16' fill='white' xmlns='http://www.w3.org/2000/svg'%3e%3cpath d='M12.207 4.793a1 1 0 010 1.414l-5 5a1 1 0 01-1.414 0l-2-2a1 1 0 011.414-1.414L6.5 9.086l4.293-4.293a1 1 0 011.414 0z'/%3e%3c/svg%3e\")"}]

   ["[type='radio']:checked"
    {:background-image "url(\"data:image/svg+xml,%3csvg viewBox='0 0 16 16' fill='white' xmlns='http://www.w3.org/2000/svg'%3e%3ccircle cx='8' cy='8' r='3'/%3e%3c/svg%3e\")"}]

   ["[type='checkbox']:checked:hover"
    "[type='checkbox']:checked:focus"
    "[type='radio']:checked:hover"
    "[type='radio']:checked:focus"
    {:background-color "currentColor"
     :border-color     "transparent"}]

   ["[type='checkbox']:indeterminate"
    {:background-image    "url(\"data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 16 16'%3e%3cpath stroke='white' stroke-linecap='round' stroke-linejoin='round' stroke-width='2' d='M4 8h8'/%3e%3c/svg%3e\")"
     :border-color        "transparent"
     :background-color    "currentColor"
     :background-size     "100% 100%"
     :background-position "center"
     :background-repeat   "no-repeat"}]

   ["[type='checkbox']:indeterminate:hover"
    "[type='checkbox']:indeterminate:focus"
    {:background-color "currentColor"
     :border-color     "transparent"}]

   ["[type='file']"
    {:background    "unset"
     :border-color  "inherit"
     :border-width  "0"
     :border-radius "0"
     :padding       "0"
     :font-size     "unset"
     :line-height   "inherit"}]

   ["[type='file']:focus"
    {:outline "1px auto -webkit-focus-ring-color"}]])
