# Biomedical AI Technical Portfolio

This repository collects sanitized projects and notebook demos that show practical work across biosignal processing, neural decoding, medical imaging, applied machine learning, and web application development.

The materials are adapted from previous research and project workflows. Non-public data, local paths, course framing, and personal identifiers have been removed. The goal is to show the technical workflow rather than publish original private datasets.

## Recommended Review Order

1. `01_ecog_neural_decoding_pipeline.ipynb`
   - End-to-end ECoG signal processing and decoding workflow
   - Memory-aware loading, epoching, high-gamma features, PCA, model comparison, leakage checks

2. `02_ecog_decoding_algorithm_prototype.ipynb`
   - Compact decoding prototype
   - Bad-channel handling, filtering, feature calculation, train/test split, regression-style decoding

3. `03_eeg_lstm_seizure_detection_demo.ipynb`
   - LSTM-based EEG sequence modeling
   - Autoregressive prediction error, seizure-like segment detection, confusion matrix evaluation

4. `04_medical_image_registration_pytorch_demo.ipynb`
   - 3D medical image registration workflow
   - SimpleITK, PyTorch tensors, affine transforms, optimization, visualization

5. `05_medical_image_segmentation_nnunet_demo.ipynb`
   - Medical image segmentation setup and evaluation workflow
   - nnU-Net-style folder organization, inference, Dice/IoU summaries

6. `06_tabular_ml_airbnb_price_prediction.ipynb`
   - General applied ML example
   - Data cleaning, feature engineering, regression models, model comparison, visualization

7. `07_moviedb_web_application/`
   - Java Spring MVC movie analytics web application
   - MySQL schema, CSV import, JSP views, JavaScript visualisations, and Tomcat WAR deployment

## Skills Demonstrated

- Python scientific computing with NumPy, SciPy, pandas, matplotlib, and scikit-learn
- Biosignal preprocessing, feature extraction, and model evaluation
- Neural decoding workflows for ECoG/EEG-style data
- Deep learning prototypes with PyTorch/Keras
- 3D medical image processing with SimpleITK and PyTorch
- Practical notebook-based analysis and visualization
- Java Spring MVC, MySQL-backed data access, JSP/JavaScript UI, and local web deployment

## Notes

These materials are portfolio demonstrations. Some notebook cells use placeholder paths such as `data/...` because the original research or project data is not public.

For a production repository, the strongest next step would be converting the first two ECoG notebooks into a reusable Python package with `src/`, synthetic sample data, tests, and a concise runnable demo.
